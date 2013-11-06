SUMMARY = "Net::DNS package"
AUTHOR = "NLnet Labs <cpan@ninetlabs.nl>"
HOMEPAGE = "https://metacpan.org/release/Net-DNS"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=f21d77d9c6b56a07470bbce561b169e3"

SRC_URI = "http://cpan.metacpan.org/authors/id/N/NL/NLNETLABS/Net-DNS-${PV}.tar.gz"
SRC_URI[md5sum] = "393e48ec6f28abe5ed30204276e02775"
SRC_URI[sha256sum] = "a62cae0be54a9684c305456cb95515a0bd3128d6ef3093b6069fe8e8e8d5943f"

S = "${WORKDIR}/Net-DNS-${PV}"

RDEPENDS_${PN} = " \
                 perl-module-data-dumper \
                 libdigest-hmac_md5-perl \
                 libdigest-md5-perl \
                 libdigest-sha-perl \
                 libio-socket-perl \
                 libmime-base64-perl \
                 libtest-more-perl \
                 "

RPROVIDES_${PN} = " \
                  libnet-dns-domain-perl \
                  libnet-dns-domainname-perl \
                  libnet-dns-header-perl \
                  libnet-dns-mailbox-perl \
                  libnet-dns-nameserver-perl \
                  libnet-dns-packet-perl \
                  libnet-dns-parameters-perl \
                  libnet-dns-question-perl \
                  libnet-dns-rr-perl \
                  libnet-dns-rr-a-perl \
                  libnet-dns-rr-aaaa-perl \
                  libnet-dns-rr-afsdb-perl \
                  libnet-dns-rr-apl-perl \
                  libnet-dns-rr-cert-perl \
                  libnet-dns-rr-cname-perl \
                  libnet-dns-rr-dhcid-perl \
                  libnet-dns-rr-dname-perl \
                  libnet-dns-rr-eid-perl \
                  libnet-dns-rr-hinfo-perl \
                  libnet-dns-rr-hip-perl \
                  libnet-dns-rr-ipseckey-perl \
                  libnet-dns-rr-isdn-perl \
                  libnet-dns-rr-kx-perl \
                  libnet-dns-rr-l32-perl \
                  libnet-dns-rr-l64-perl \
                  libnet-dns-rr-loc-perl \
                  libnet-dns-rr-lp-perl \
                  libnet-dns-rr-mb-perl \
                  libnet-dns-rr-minfo-perl \
                  libnet-dns-rr-mr-perl \
                  libnet-dns-rr-mx-perl \
                  libnet-dns-rr-naptr-perl \
                  libnet-dns-rr-nid-perl \
                  libnet-dns-rr-nimloc-perl \
                  libnet-dns-rr-ns-perl \
                  libnet-dns-rr-nsap-perl \
                  libnet-dns-rr-null-perl \
                  libnet-dns-rr-opt-perl \
                  libnet-dns-rr-ptr-perl \
                  libnet-dns-rr-px-perl \
                  libnet-dns-rr-rp-perl \
                  libnet-dns-rr-rt-perl \
                  libnet-dns-rr-soa-perl \
                  libnet-dns-rr-spf-perl \
                  libnet-dns-rr-srv-perl \
                  libnet-dns-rr-sshfp-perl \
                  libnet-dns-rr-tkey-perl \
                  libnet-dns-rr-tlsa-perl \
                  libnet-dns-rr-tsig-perl \
                  libnet-dns-rr-txt-perl \
                  libnet-dns-rr-x25-perl \
                  libnet-dns-resolver-perl \
                  libnet-dns-resolver-base-perl \
                  libnet-dns-mswin32-perl \
                  "

inherit cpan

BBCLASSEXTEND = "native"
